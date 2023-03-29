public class ProfissionalMain {

    public static void main(String[] args) {

        Profissional profissional = new Profissional();

        System.out.println(profissional.trabalharPublic());

        System.out.println(profissional.trabalharProtected());

        profissional.setId(1);
        System.out.println(profissional.getId());

        profissional.idProtected = 2;
        System.out.println(profissional.idProtected);

        profissional.idPublic= 3;
        System.out.println(profissional.idPublic);





    }
}
