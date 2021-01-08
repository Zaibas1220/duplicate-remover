package tools;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {

    private Set<String> characterStrings;
    private int duplicatesDetected;


    public PersonalDuplicateRemover(){
        characterStrings = new HashSet<>();
        duplicatesDetected = 0;
    }

    @Override
    public void add(String characterString) {
        if (characterStrings.contains(characterString)){
            duplicatesDetected++;
        }else{
            characterStrings.add(characterString);
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return duplicatesDetected;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return characterStrings;
    }

    @Override
    public void empty() {
        characterStrings.clear();
        duplicatesDetected = 0;
    }
}
