package iit.uni.miskolc.hu.FelevesFeladat;

import java.util.List;

public interface AnimalService {
    List<AnimalDto> findAll();
    AnimalDto getById(Long id);
    Long save(AnimalDto animalDto);
    void delete(Long id);
}
