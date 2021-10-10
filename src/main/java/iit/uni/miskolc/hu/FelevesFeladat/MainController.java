package iit.uni.miskolc.hu.FelevesFeladat;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path="animal")
public class MainController {

    private final AnimalService animalService;

    public MainController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping(path="", produces= MediaType.APPLICATION_JSON_VALUE)
    public List<AnimalDto> allAnimals() {
        return animalService.findAll();
    }

    @PostMapping(path="")
    public void newAnimal(@RequestBody @Valid AnimalDto animalDto) {
        animalService.save(animalDto);
    }

    @PutMapping(path="/")
    public void replaceAnimal(@RequestBody @Valid AnimalDto animalDto) {
        animalService.save(animalDto);
    }

    @DeleteMapping (path="/{id}")
    public void deleteAnimal(@PathVariable("id") Long id) {
        animalService.delete(id);
    }

}
