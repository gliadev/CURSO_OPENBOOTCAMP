package ejercicios.cursoJavaBasico.ejerciciosTema5;

import java.sql.Array;

public class ejercicioTema5 {
    public interface CocheCRUD {

        void save();
        void findAll();
        void delete();
        int numero[] = new int[10];

    }

    public static class CocheCRUDImpl implements CocheCRUD {

            // los creo como en el video
        @Override
        public void save() {
        }

        @Override
        public void findAll() {
        }

        @Override
        public void delete() {
        }

        String save = "Guardando";
        String findAll = "Buscar todo";
        String delete = "Borrando";

        @Override
        public String toString() {
            return "CocheCRUDImpl" +
                    " save=" + save +
                    ", findAll=" + findAll +
                    ", delete=" + delete;
        }
    }

    public static void main(String[] args) {

        CocheCRUD cocheCrud = new CocheCRUDImpl();
        System.out.println(cocheCrud);

    }

}

