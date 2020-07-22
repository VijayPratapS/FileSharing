package com.example.fileSharing;

import com.example.fileSharing.Service.UserService;
import com.example.fileSharing.model.User;
import com.example.fileSharing.repository.UserDetails;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
class FileSharingApplication {


	@Autowired
	private UserService  service;

	@MockBean
	private UserDetails details;

	@Test
	public void testRegister()
	{
		User testUser=new User();
		testUser.setUserid("vijaypr120");
		testUser.setPassword("vijay");
		Mockito.when(details.save(testUser)).thenReturn(testUser);

	    assertThat(service.register(testUser)).isEqualTo(testUser);
	}


}
