package com.example.mythologie.Controller;

import com.example.mythologie.DTO.PersonnageDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Personnage")
public class PersonnageController {

    @PostMapping("add")
    public boolean ajouterPersonnage(@RequestBody PersonnageDTO dto)
    {
        return true;
    }
}
