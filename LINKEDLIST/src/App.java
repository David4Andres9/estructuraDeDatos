import java.util.Scanner;
public class App {
    private String menu;
    private List list;
    private int initialInfo=0;
    private Scanner teclado1;
    public void displayMenu(){
        this.teclado1= new Scanner(System.in);
        int number=0;
        this.menu=
        "Lista enlazada simple \n"+
        "1. Crear lista \n"+
        "2. Imprimir lista \n"+
        "3. Agregar nodos al inicio \n"+
        "4. Agregar nodos al final \n"+
        "5. Buscar nodo \n"+
        "6. Borrar nodo inicial \n"+
        "7. Borrar nodo final \n"+
        "8. Salir \n";
        do{
            System.out.println("Ingresa la opcion");
            System.out.println(this.menu);
            number=this.teclado1.nextInt();
            
            switch(number){
                case 1 : 
                    createList();
                break;
                
                case 2: 
                    System.out.println(this.list.print());
                break;
                
                case 3:
                    this.unshiftNode();
                break;
                
                case 4: 
                    this.pushNode();
                break;
                
                case 5:
                    this.searchNode();
                break;
                
                case 6: 
                    this.shiftNode();
                break;
                
                case 7: 
                    this.popNode();
                break;

                default:
                System.out.println("Opcion incorrecta");
            }
        }while(number!=8);
    }

    public void createList(){
        this.list=new List();
        int av;
        System.out.println("Cuantos datos quieres que salgan");        
        av=this.teclado1.nextInt();
        for (int i=0; i<=av;i++){
            this.list.push(i);
        }
        System.out.println(this.list.print());
    }
    public void unshiftNode(){
        int value;
        System.out.println("Que valor desea ingresar");
        value=this.teclado1.nextInt();
        this.list.unshift(value);        
        System.out.println(this.list.print());
    }

    public void pushNode(){
        int value;
        System.out.println("Que valor desea ingresar");
        value=this.teclado1.nextInt();
        this.list.push(value);        
        System.out.println(this.list.print());
    }

    public void searchNode(){
        int searchValue;
        System.out.println("Ingresa el valor a buscar");
        searchValue=this.teclado1.nextInt();
        if(this.list.search(searchValue)){
            System.out.println("Nodo encontrado");
        }else{
            System.out.println("Valor no contrado");
        }
        System.out.println(this.list.print());

    }

    public void shiftNode(){
        if(this.list.shift()){
            System.out.println("Valor eliminado");
        }else{
            System.out.println("Valor no encontrado");
        }
        System.out.println(this.list.print());
    }

    public void popNode(){
        if(this.list.pop()){
            System.out.println("Valor eliminado");
        }else{
            System.out.println("No se encontro nodo");
        }
        System.out.println(this.list.print());
    }





    public static void main(String[] args) throws Exception {
        App list= new App();
        list.displayMenu();

       
          


    }
}
