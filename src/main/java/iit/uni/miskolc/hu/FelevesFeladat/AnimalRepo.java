package iit.uni.miskolc.hu.FelevesFeladat;

import java.util.List;

public interface AnimalRepo {
            List<AnimalDto> findAll();
            AnimalDto getByID(long id);
            Long save(AnimalDto animalDto);
            void delete(Long id);
        }

