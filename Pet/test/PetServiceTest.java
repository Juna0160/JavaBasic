package test;

import pet.PetDAO;
import pet.PetService;
import pet.PetVO;
import pet.GNPetService;
import pet.ListPetDAO;

public class PetServiceTest {

    public static void main(String[] args) {

        PetService ps = new GNPetService(new ListPetDAO());

        // 펫 등록
        ps.registPet(new PetVO("test", "kopo", 10000, 10));
        ps.registPet(new PetVO("test2", "home", 1000, 5));
        ps.registPet(new PetVO("test3", "home", 3000, 15));

        // 펫 목록
        System.out.println(ps.listPets());

        // 펫 상세정보
        System.out.println(ps.detailPetInfo(112));

        // 펫 정보 수정
        ps.updatePetInstock(111, 15);
        ps.updatePetPrice(112, 30000);

        System.out.println(ps.listPets());

        // 펫 삭제
        ps.removePet(113);

        System.out.println(ps.listPets());
    }

    static void DAOTest() {
        PetDAO petDAO = new ListPetDAO();

        // 펫 등록
        petDAO.insertPet(new PetVO("gyejeong", "kopo", 10000, 10));
        petDAO.insertPet(new PetVO("curi", "home", 1000, 5));
        petDAO.insertPet(new PetVO("hye", "home", 3000, 15));

        // 펫 정보
        System.out.println(petDAO.selectAllPets());
        System.out.println(petDAO.selectPet(112));

        // 펫 정보 수정
        PetVO pet = petDAO.selectPet(111);
        pet.setInstock(15);
        petDAO.updatePet(pet);

        PetVO pet1 = petDAO.selectPet(112);
        pet1.setPrice(30000);
        petDAO.updatePet(pet1);

        System.out.println(petDAO.selectAllPets());

        // 펫 삭제
        petDAO.deletePet(113);
        System.out.println(petDAO.selectAllPets());
    }
}