package pet;

import java.util.List;

public interface PetService {
    boolean registPet(PetVO pet);
    List<PetVO> listPets();
    PetVO detailPetInfo(int petNo);
    boolean updatePetPrice(int petNo, int price);
    boolean updatePetInstock(int petNo, int instock);
    boolean removePet(int petNo);
}