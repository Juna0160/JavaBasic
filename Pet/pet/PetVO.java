package pet;

public class PetVO {
    private int petNo;
    private String name;
    private String company;
    private int price;
    private int instock;

    // 전체 생성자
    public PetVO(int petNo, String name, String company, int price, int instock) {
        this.petNo = petNo;
        this.name = name;
        this.company = company;
        this.price = price;
        this.instock = instock;
    }

    // petNo 없이 사용하는 생성자
    public PetVO(String name, String company, int price, int instock) {
        this(-1, name, company, price, instock);
    }

    @Override
    public String toString() {
        return "[" + petNo + ", " + name + ", " + company + ", " + price + ", " + instock + "]";
    }

    // getter/setter
    public int getPetNo() {
        return petNo;
    }

    public void setPetNo(int petNo) {
        this.petNo = petNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getInstock() {
        return instock;
    }

    public void setInstock(int instock) {
        this.instock = instock;
    }
}
