package com.chakri.curefit.models;

import com.chakri.curefit.dto.ResponseUserDto;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.User;

@Entity
@Table(name = "users")
@Setter
public class Users extends Basemodel{



    private long mobileNumber;
    private String name;
    private String emailAddress;
    private int weight;
    private int height;
    private String Password;

    public Users() {

    }

    public static UsersBuilder builder(){
        return new UsersBuilder();
    }

    public ResponseUserDto toDto(){
        return ResponseUserDto.builder()
                .weight(this.weight)
                .name(this.name)
                .height(this.height)
                .emailaddress(this.emailAddress)
                .mobilNumber(String.valueOf(this.mobileNumber))
                .build();
    }

    public static class UsersBuilder{
        private long mobileNumber;
        private String name;
        private String emailAddress;
        private int weight;
        private int height;
        private String Password;

        public UsersBuilder setMobileNumber(long mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public UsersBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UsersBuilder setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public UsersBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public UsersBuilder setHeight(int height) {
            this.height = height;
            return this;
        }

        public UsersBuilder setPassword(String password) {
            Password = password;
            return this;
        }
        public Users build(){
            Users user = new Users();
            user.emailAddress = emailAddress;
            user.height = height;
            user.weight = weight;
            user.mobileNumber = mobileNumber;
            user.name = name;
            user.Password = Password;
            return user;

        }
    }
}
