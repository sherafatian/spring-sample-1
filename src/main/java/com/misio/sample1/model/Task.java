package com.misio.sample1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TASKS")
public class Task extends _AbstractModel {

    @Column(name = "TITLE", nullable = false, length = 250)
    private String title;

    @Column(name = "DESCRIPTION", length = 2000)
    private String description;

    @Column(name = "ISSUE_TYPE", nullable = false, length = 50)
    private String issueType;

    @Column(name = "PRIORITY", nullable = false, length = 15)
    private String priority;
}
