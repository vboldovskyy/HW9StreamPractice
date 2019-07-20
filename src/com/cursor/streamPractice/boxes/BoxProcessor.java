package com.cursor.streamPractice.boxes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class BoxProcessor {
    private static final int THINGS_IN_A_BOX = 10;
    private Collection<Box> boxCollection = new ArrayList<>();

    public BoxProcessor(int boxes){
        for(int i = 0; i<boxes; i++)
            boxCollection.add(new Box(THINGS_IN_A_BOX));
    }

    public List<Protector> wrapAllFragileThingsInBoxes(){
       return boxCollection.stream()
                .flatMap(box ->  box.getThings().stream()
                        .filter(Thing::isFragile)
                        .map(Protector::new))
                .collect(Collectors.toList());
    }

    public boolean areAllFragile(List<Protector> protectorList){
        for (Protector p : protectorList)
        {
            if(!p.getThing().isFragile())
                return false;
        }
        return true;
    }
}
