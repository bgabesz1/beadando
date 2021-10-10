package iit.uni.miskolc.hu.FelevesFeladat;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class AnimalSerimp implements AnimalService {
    private final int Maxanimal = 20;
    private final AnimalRepo animalrepo;

    public AnimalSerimp(AnimalRepo animalrepo) {
        this.animalrepo = animalrepo;
    }

    @Override
    public List<AnimalDto> findAll() {
        return animalrepo.findAll();
    }

    @Override
    public AnimalDto getById(Long id) {
        return animalrepo.getByID(id);
    }

    @Override
    public Long save(AnimalDto articleDto) {
        if (animalrepo.findAll().size()>=Maxanimal){
            throw new ToomuchanimalExc();
        }
        return animalrepo.save(articleDto);
    }

    @Override
    public void delete(Long id) {
    animalrepo.delete(id);
    }
}
