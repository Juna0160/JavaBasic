package pet;

import java.util.List;

public class GNPetService implements PetService {

    private PetDAO petDAO;

    public GNPetService(PetDAO petDAO) {
        this.petDAO = petDAO;
    }

    @Override
    public boolean registPet(PetVO pet) {
        return petDAO.insertPet(pet);
    }

    @Override
    public List<PetVO> listPets() {
        return petDAO.selectAllPets();
    }

    @Override
    public PetVO detailPetInfo(int petNo) {
        return petDAO.selectPet(petNo);
    }

    @Override
    public boolean updatePetPrice(int petNo, int price) {
        PetVO pet = petDAO.selectPet(petNo);
        if (pet != null) {
            pet.setPrice(price);
            return petDAO.updatePet(pet);
        }
        return false;
    }

    @Override
    public boolean updatePetInstock(int petNo, int instock) {
        PetVO pet = petDAO.selectPet(petNo);
        if (pet != null) {
            pet.setInstock(instock);
            return petDAO.updatePet(pet);
        }
        return false;
    }

    @Override
    public boolean removePet(int petNo) {
        return petDAO.deletePet(petNo);
    }
}
