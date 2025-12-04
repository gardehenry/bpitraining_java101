package act6_Henry;

public class myRunner {
	public static void main(String[] args) {
        book myBook = new book();
        myBook.author = "Dasu";
        myBook.title = "Stellar Paradigm";
        myBook.bookInfo();

        System.out.println("---------------------------------------------");

        house myHouse = new house();
        myHouse.street = "Kamia";
        myHouse.barangay = "San Francisco";
        myHouse.city = "Binan City";
        myHouse.houseInfo();

        System.out.println("---------------------------------------------");

        tree myTree = new tree();
        myTree.name = "Maple";
        myTree.count = 3;
        myTree.treeInfo();
    }

}
