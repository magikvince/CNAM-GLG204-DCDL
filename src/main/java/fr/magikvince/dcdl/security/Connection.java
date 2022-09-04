package fr.magikvince.dcdl.security;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "T_CONNECTION")
public class Connection {
	int idConnection;
	LocalDateTime dtLogon;
	LocalDateTime dtLogout;
	User user;
}
