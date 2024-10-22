package com.pets.store.dao;

import com.pets.store.model.Pet;

public interface PetDAO {

    public Pet getPetById (int id);
    public Pet registerPet(Pet pet);

    public Pet registerPetParent (Pet petParent);
    public Pet updatePet(Pet updatepet);
    public Pet updatePetParent(Pet updatepetParent);
    public void deletePet(int id);

    public void deletePetParent(int id);
}
