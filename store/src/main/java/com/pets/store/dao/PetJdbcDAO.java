package com.pets.store.dao;

import com.pets.store.model.Pet;
import org.springframework.stereotype.Component;

@Component
public class PetJdbcDAO implements PetDAO{
    @Override
    public Pet getPetById(int id) {
        return null;
    }

    @Override
    public Pet registerPet(Pet pet) {
        return null;
    }

    @Override
    public Pet registerPetParent(Pet petParent) {
        return null;
    }

    @Override
    public Pet updatePet(Pet updatepet) {
        return null;
    }

    @Override
    public Pet updatePetParent(Pet updatepetParent) {
        return null;
    }

    @Override
    public void deletePet(int id) {

    }

    @Override
    public void deletePetParent(int id) {

    }
}
