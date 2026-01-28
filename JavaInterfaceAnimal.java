interface JavaInterfaceAnimal{
    public void animalSound();
    
}
class pig implements JavaInterfaceAnimal{
        public void animalSound(){
            System.out.println("Wee Wee");
        }
}

class Main{
    public static void main(String[] args) {
        pig mypig = new pig();
        mypig.animalSound();
    }
}