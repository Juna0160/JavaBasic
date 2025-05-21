package pet;

import java.util.LinkedList;
import java.util.List;

public class ListPetDAO implements PetDAO {

    private List<PetVO> petList = new LinkedList<>();
    private int petSeq = 111; // 펫 번호 1씩 증가

    @Override
    public boolean insertPet(PetVO pet) {
        pet.setPetNo(petSeq++);
        petList.add(pet);
        return true;
    }

    @Override
    public PetVO selectPet(int petNo) {
        for (PetVO pet : petList) {
            if (pet.getPetNo() == petNo)
                return pet;
        }
        return null;
    }

    @Override
    public List<PetVO> selectAllPets() {
        return petList;
    }

    @Override
    public boolean updatePet(PetVO newPet) {
        for (int i = 0; i < petList.size(); i++) {
            if (petList.get(i).getPetNo() == newPet.getPetNo()) {
                petList.set(i, newPet);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deletePet(int petNo) {
        for (int i = 0; i < petList.size(); i++) {
            if (petList.get(i).getPetNo() == petNo) {
                petList.remove(i);
                return true;
            }
        }
        return false;
    }
}
