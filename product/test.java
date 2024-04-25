package product;

class test {
    public static void main(String[] args) {
        Product p1=new Product("pencilNatraj",5,"Jan-2099");
        Product p2=new Product("pencilDoms",5,"Feb-2099");
        Product p3=new Product("pencilCamlin",5,"Mar-2099");
        Product p4=new Product("pencilApsra",5,"Apr-2099");
        Product p5=new Product("pencilCamel",5,"Dec-2099");
        Product[] productArray={p1,p2,p3,p4,p5};
        Product p6=new Product("pencilNatraj",5,"Jan-2099");

        for (int i = 0; i <productArray.length ; i++) {
            if(productArray[i].equals(p6))
            {
                System.out.println("found");
            }
        }
    }


}
