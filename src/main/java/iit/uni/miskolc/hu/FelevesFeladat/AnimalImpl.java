package iit.uni.miskolc.hu.FelevesFeladat;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AnimalImpl implements AnimalRepo{
    private final List<AnimalDto> animals =new ArrayList<>();


    @Override
    public List<AnimalDto> findAll(){
        return animals;
    }

    private int findanimalbyid(Long id) {
        int found = -1;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).getType().equals(id)) {
                found = i;
                break;
            }
        }
        return found;
    }
    @Override
    public AnimalDto getByID(long id){
        return null;
    }
    @Override
    public Long save(AnimalDto animalDto){
        int found=findanimalbyid(animalDto.getId());

        if(found!=-1){
            AnimalDto foundAnimal=animals.get(found);
            foundAnimal.setType(animalDto.getType());
            foundAnimal.setLegs(animalDto.getLegs());
        }
        else{
            animals.add(animalDto);
        }
        return null;
    }


    @Override
public void delete(Long id) {
    int found = findanimalbyid(id);

    if (found != -1) {
        animals.remove(found);
    }
}

}
