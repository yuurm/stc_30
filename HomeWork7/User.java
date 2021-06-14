package HomeWork7;

public final class User {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isWorker;

    private User() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsWorker() {
        return isWorker;
    }

    public static Builder builder() {
        return new User().new Builder();
    }

    public class Builder {

        private Builder() {
        }

        public Builder firstName(String firstName) {
            User.this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            User.this.lastName = lastName;
            return this;
        }

        public Builder age(int age) {
            User.this.age = age;
            return this;
        }

        public Builder isWorker(boolean isWorker) {
            User.this.isWorker = isWorker;
            return this;
        }

        public User build() {
            return User.this;
        }


    }


}

