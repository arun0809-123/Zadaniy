public  class Caw {
    private String weight;//massa
    private String age;
    private String gender;//pol
    private String nickName;

    public void Fram(String weight, String age, String gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }
    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Caw{" +
                "weight='" + weight + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
