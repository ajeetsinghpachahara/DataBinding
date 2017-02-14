package com.ajeet.databindingtest;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ajeet.databindingtest.databinding.ActivityMainBinding;
import com.ajeet.databindingtest.model.Employee;
import com.ajeet.databindingtest.model.User;

public class MainActivity extends AppCompatActivity {

    User user;
    Employee employee;
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User("AJEET", "SINGH");
        employee = new Employee();
        binding.setUser(user);
        binding.setEmployee(employee);
        employee.setFirstName("GOPAL");
        employee.setLastName("SINGH");


        binding.btChangeEmpName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                employee.setFirstName("AJEET");
            }
        });
        binding.btChangeUserName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.setFirstName("GOPAL");
                binding.setUser(user);

            }
        });

    }
}
