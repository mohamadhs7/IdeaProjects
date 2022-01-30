package com.dotin.entities;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Entity
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    @ElementCollection
    @JoinTable(name = "impossibleOffDates")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<LocalDate> impossibleOffRequestsDates;
    private Role role;

    @OneToMany(mappedBy = "manager")
    private List<Employee> employee;

    public Manager() {
    }

    public Manager(String firstName, String lastName, List<LocalDate> impossibleOffRequestsDates, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.impossibleOffRequestsDates = impossibleOffRequestsDates;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    public List<LocalDate> getImpossibleOffRequestsDates() {
        return impossibleOffRequestsDates;
    }

    public void setImpossibleOffRequestsDates(List<LocalDate> impossibleOffRequestsDates) {
        this.impossibleOffRequestsDates = impossibleOffRequestsDates;
    }

    public void addImpossibleOffRequestsDate(LocalDate date) {
        impossibleOffRequestsDates.add(date);
    }

    public void addImpossibleOffRequestsDate(List<LocalDate> dates) {
        impossibleOffRequestsDates.addAll(dates);
    }

    public void answeroffRequests(List<Employee> employees) {
        for (Employee e : employees) {
            e.setOffRequestSituation(1);
            for (LocalDate l : impossibleOffRequestsDates) {
                int j = 0;
                if (j == 0) {
                    for (LocalDate l2 : e.getOffRequestsDates()) {
                        if (l.equals(l2)) {
                            j++;
                            e.setOffRequestSituation(-1);
                            e.setOffRequestcounts(e.getOffRequestcounts()-1);
                            e.setOffRequestsDates(null);
                            break;
                            }
                        }
                    }else
                        break;
                }
            e.setOffRequset(false);
        }
    }
}
