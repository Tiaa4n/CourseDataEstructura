public class EjecutarMoto {
    public static void main(String[]args) {

        Moto[] m = new Moto[8];

        m[0] =new Moto(2026,"AKT Turing","Negra", 125.0,1250.0);
        m[1] =new Moto(2025,"Kawasaki Ninja","Verde",400.0,25000.0);
        m[2] =new Moto(2026,"Honda","Rojo",350.0,4000.0);
        m[3] =new Moto(2027,"Honda C90","DoradoNegro",90.0,10000.0);
        m[4] =new Moto(2025,"Yamaha Crypton FI","Negra",114.0,2444.0);
        m[5] =new Moto(2026,"Yamaha NMAXV3","GrisBlanca",155.0,4500.0);
        m[6] =new Moto(2021,"Suzuki Dr","Amarilla",650.0,14000.0);
        m[7] =new Moto(2003,"Suzuki Freewind","Gris",650.0,4600.0);


        //Operaciones con los objetos del arreglo

        //Obtener el promedio de los modelos de las motos del arreglo
        int suma = 0;
        for (int i = 0; i < m.length; i++){
            suma += m[i].getModelo();
        }
        System.out.println("El promedio de los modelos de las motos del arreglo es: " + (suma / m.length));

        //Obtener las motos que puedo comprar con un presupuesto de 20000 dolares.
        String cad = "";
        for (int i = 0; i < m.length; i++){
            if(m[i].getPrecio() <= 20000.0){
            cad += "-" + m[i].getMarca() + " " + m[i].getPrecio()+ " \n";
            }
        }
        System.out.println("Las motos que puedo comprar con 20000.0US son: " + cad);
    }
}