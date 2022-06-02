package br.espm.canoafurada.user;

import org.apache.catalina.User;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity(name = "user")
public class UserEntity {


    public UserEntity(){}

    public UserEntity(UserDto user){
        this.name = user.getName();
        this.document = user.getDocument();
        this.cellphone = user.getCellphone();
    }

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", columnDefinition = "char(36)")
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID id;

    @Column(name = "name", nullable = false, columnDefinition = "char(36)")
    private String name;

    @Column(name = "document", nullable = false, columnDefinition = "char(36)")
    private String document;

    @Column(name = "cellphone", nullable = false, columnDefinition = "char(36)")
    private String cellphone;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public UserDto toDto(){
        var user = new UserDto();
        user.setId(id);
        user.setName(name);
        user.setDocument(document);
        user.setCellphone(cellphone);

        return user;
    }
}
