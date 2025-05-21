package pet;

import java.util.List;

public interface PetDAO {
    boolean insertPet(PetVO pet);
    PetVO selectPet(int petNo);
    List<PetVO> selectAllPets();
    boolean updatePet(PetVO newPet);
    boolean deletePet(int petNo);
}
