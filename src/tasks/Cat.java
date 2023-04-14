// Придуймайте структуру класса Кот. Какие поля и методы будут актуальны для приложения,
// которое является информационной системой ветеринарной клиники.

package tasks;

import java.util.Objects;

public class Cat {
    public String name;
    public int age;
    public Boolean isIll;
    public String diagnoses;
    public Owner owner;
    public Cat(String name, int age, boolean isIll, String diagnoses, Owner owner) {
        this.name = name;
        this.age = age;
        this.isIll = isIll;
        this.diagnoses = diagnoses;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return String.format("Cat {name = %s, age = %s, isIll = %s, diagnoses = %s, owner = %s}",
                name, age, isIll, diagnoses, owner);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Cat cat = (Cat)obj;
        return cat.name.equals(this.name) && cat.age == (this.age) && cat.isIll == this.isIll &&
                cat.diagnoses.equals(this.diagnoses);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null)? 0: name.hashCode());
        result = prime * result + age;
        result = prime * result + ((diagnoses == null)? 0: diagnoses.hashCode());
        return result;
    }
}
