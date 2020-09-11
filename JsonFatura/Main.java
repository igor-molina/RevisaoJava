package JsonFatura;

import LojaEletro.Fatura;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fatura fat = new Fatura();
        String nome_arquivo;

        System.out.println("Digite o nome do arquivo Json:");
        nome_arquivo = sc.next();

        JSONObject jsonObject;

        JSONParser parser = new JSONParser();

        try {
            //Salva no objeto JSONObject o que o parse tratou do arquivo
            jsonObject = (JSONObject) parser.parse(new FileReader(
                    nome_arquivo));

            fat.setCodFatura((int) jsonObject.get("codigo"));
            fat.setDescricao((String) jsonObject.get("descricao"));
            fat.setQtdComprada((int) jsonObject.get("quantidade"));
            fat.setPreco((double) jsonObject.get("preco"));

            System.out.print("Total das faturas:" + fat.totalFaturado(fat.getQtdComprada(), fat.getPreco()) + " (" + fat.getQtdComprada() + "faturas)");
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
