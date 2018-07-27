package org.ac.hackathon.command;

import org.springframework.stereotype.Repository;

/**
 * Created by codecadet on 26/07/2018.
 */

public class CompanionDto {

    private Integer did;
    private String name;
    private String local;
    private String contact; //email
    private String photo; //phone


    public Integer getId() {
        return did;
    }

    public void setDid(Integer id) {
        this.did = did;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }


}
