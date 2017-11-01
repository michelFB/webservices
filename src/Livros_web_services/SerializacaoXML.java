package Livros_web_services;

import com.thoughtworks.xstream.XStream;

public class SerializacaoXML {
    
    public static void main(String[] args) {
        XStream xstream = new XStream();
        Livro livro = new Livro(2000, "Assim Falou Zaratustra", "123");
        String xml = xstream.toXML(livro);
        System.out.println("XML = ");
        System.out.println(xml);
    }
}