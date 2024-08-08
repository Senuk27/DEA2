package org.example.dea2.service.serviceImpl;

import org.example.dea2.dto.request.LoginApiRequest;
import org.example.dea2.dto.request.SignUpApiRequest;
import org.example.dea2.dto.response.ApiResponse;
import org.example.dea2.entity.UserDetailsEntity;
import org.example.dea2.repository.UserRepository;
import org.example.dea2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
    @Override
    public ApiResponse userSignUp(SignUpApiRequest request) {
        ApiResponse response = new ApiResponse();
        try{
            String encodedPassword = bCryptPasswordEncoder.encode(request.getPassword());
            UserDetailsEntity userSave=new UserDetailsEntity();
            userSave.setName(request.getName());
            userSave.setPassword(encodedPassword);
            userSave.setEmail(request.getEmail());

            userRepository.save(userSave);

            response.setUserData(userSave);
            response.setMessage("User registered successfully");
            response.setStatus(200);


        }
        catch(Exception e){
            response.setMessage("error: "+e.getMessage());
            response.setStatus(400);
        }
        return response;
    }

    @Override
    public ApiResponse userLogin(LoginApiRequest request) {
        ApiResponse response = new ApiResponse();

        try{
            UserDetailsEntity user= userRepository.findByEmail(request.getEmail());

            if(user!=null){
                if(bCryptPasswordEncoder.matches(request.getPassword(), user.getPassword())){
                    response.setMessage("Login successful");
                    response.setStatus(200);

                }else {
                    response.setMessage("Login failed");
                    response.setStatus(400);

                }

            }
            else {
                response.setMessage("user not found");
                response.setStatus(404);
            }

        }
        catch(Exception e){
            response.setMessage("error: "+e.getMessage());
            response.setStatus(400);
        }
        return response;
    }
}
