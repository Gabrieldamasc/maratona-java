package academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.dominio;

public class Pessoa {
    private String firstname;
    private String lastname;
    private String userName;
    private String email;

    public Pessoa(String firstname, String lastname, String userName, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.userName = userName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static final class PessoaBuilder {
        private String firstname;
        private String lastname;
        private String userName;
        private String email;

        public PessoaBuilder() {
        }

        public PessoaBuilder firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public PessoaBuilder lastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public PessoaBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public PessoaBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(firstname, lastname, userName, email);
        }
    }
}
