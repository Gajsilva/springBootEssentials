package br.com.devdojo.model;

import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class  Student extends AbstractEntity  {
    @Valid
    @NotNull
    @NotEmpty

    private String name;
    @Valid
    @Email
    @NotNull
    @NotEmpty
    private  String email;
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
