package com.example.calculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.calculator.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    private String operation="";
    private boolean operationClicked = false;


    private String firstValue="";
    private String secondValue="";

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(binding.txtResult.getText().toString().contains("."))
                {
                    binding.txtResult.append("1");

                }
                else if(Math.floor(Float.parseFloat(binding.txtResult.getText().toString())) == 0)
                {
                    binding.txtResult.setText("");
                    binding.txtResult.append("1");
                }
                else
                {
                    binding.txtResult.append("1");
                }
            }
        });

        binding.btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(binding.txtResult.getText().toString().contains("."))
                {
                    binding.txtResult.append("2");
                }
                else if(Math.floor(Float.parseFloat(binding.txtResult.getText().toString())) == 0)
                {
                    binding.txtResult.setText("");
                    binding.txtResult.append("2");
                }
                else
                {
                    binding.txtResult.append("2");
                }
            }
        });

        binding.btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(binding.txtResult.getText().toString().contains("."))
                {
                    binding.txtResult.append("3");
                }
                else if(Math.floor(Float.parseFloat(binding.txtResult.getText().toString())) == 0)
                {
                    binding.txtResult.setText("");
                    binding.txtResult.append("3");
                }
                else
                {
                    binding.txtResult.append("3");
                }
            }
        });

        binding.btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(binding.txtResult.getText().toString().contains("."))
                {
                    binding.txtResult.append("4");
                }
                else if(Math.floor(Float.parseFloat(binding.txtResult.getText().toString())) == 0)
                {
                    binding.txtResult.setText("");
                    binding.txtResult.append("4");
                }
                else
                {
                    binding.txtResult.append("4");
                }
            }
        });

        binding.btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(binding.txtResult.getText().toString().contains("."))
                {
                    binding.txtResult.append("5");
                }
                else if(Math.floor(Float.parseFloat(binding.txtResult.getText().toString())) == 0)
                {
                    binding.txtResult.setText("");
                    binding.txtResult.append("5");
                }
                else
                {
                    binding.txtResult.append("5");
                }
            }
        });

        binding.btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(binding.txtResult.getText().toString().contains("."))
                {
                    binding.txtResult.append("6");
                }
                else if(Math.floor(Float.parseFloat(binding.txtResult.getText().toString())) == 0)
                {
                    binding.txtResult.setText("");
                    binding.txtResult.append("6");
                }
                else
                {
                    binding.txtResult.append("6");
                }
            }
        });

        binding.btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(binding.txtResult.getText().toString().contains("."))
                {
                    binding.txtResult.append("7");
                }
                else if(Math.floor(Float.parseFloat(binding.txtResult.getText().toString())) == 0)
                {
                    binding.txtResult.setText("");
                    binding.txtResult.append("7");
                }
                else
                {
                    binding.txtResult.append("7");
                }
            }
        });

        binding.btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(binding.txtResult.getText().toString().contains("."))
                {
                    binding.txtResult.append("8");
                }
                else if(Math.floor(Float.parseFloat(binding.txtResult.getText().toString())) == 0)
                {
                    binding.txtResult.setText("");
                    binding.txtResult.append("8");
                }
                else
                {
                    binding.txtResult.append("8");
                }
            }
        });

        binding.btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(binding.txtResult.getText().toString().contains("."))
                {
                    binding.txtResult.append("9");
                }
                else if(Math.floor(Float.parseFloat(binding.txtResult.getText().toString())) == 0)
                {
                    binding.txtResult.setText("");
                    binding.txtResult.append("9");
                }
                else
                {
                    binding.txtResult.append("9");
                }
            }
        });

        binding.btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(binding.txtResult.getText().toString().contains("."))
                {
                    binding.txtResult.append("0");
                }
                else if(Math.floor(Float.parseFloat(binding.txtResult.getText().toString())) == 0)
                {
                    binding.txtResult.setText("");
                    binding.txtResult.append("0");
                }
                else
                {
                    binding.txtResult.append("0");
                }
            }
        });

        binding.btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!binding.txtResult.getText().toString().contains("."))
                    binding.txtResult.append(".");
            }
        });

        binding.btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(binding.txtResult.getText().toString() != "" && !binding.txtFirstValue.getText().toString().isEmpty())
                {
                    Calculate();
                }
                operationClicked =false;
            }
        });

        binding.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!operationClicked)
                {
                    String value = isWhole(Float.parseFloat(binding.txtResult.getText().toString()))? String.valueOf(Math.round(Float.parseFloat(binding.txtResult.getText().toString()))) : binding.txtResult.getText().toString();
                    binding.txtFirstValue.setText( value + "+");
                    binding.txtResult.setText("0");
                    operation = "+";
                    operationClicked =true;
                }
                else
                {
                    binding.txtFirstValue.setText(binding.txtFirstValue.getText().toString().substring(0,binding.txtFirstValue.getText().toString().length()-1)+"+");
                    operation = "+";
                }
            }
        });

        binding.btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!operationClicked) {
                    String value = isWhole(Float.parseFloat(binding.txtResult.getText().toString()))? String.valueOf(Math.round(Float.parseFloat(binding.txtResult.getText().toString()))) : binding.txtResult.getText().toString();
                    binding.txtFirstValue.setText(value + "-");
                    binding.txtResult.setText("0");
                    operation = "-";
                    operationClicked =true;
                }
                else
                {
                    binding.txtFirstValue.setText(binding.txtFirstValue.getText().toString().substring(0,binding.txtFirstValue.getText().toString().length()-1)+"-");
                    operation = "-";
                }
            }
        });

        binding.btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!operationClicked) {
                    String value = isWhole(Float.parseFloat(binding.txtResult.getText().toString()))? String.valueOf(Math.round(Float.parseFloat(binding.txtResult.getText().toString()))) : binding.txtResult.getText().toString();
                    binding.txtFirstValue.setText(value + "*");
                    binding.txtResult.setText("0");
                    operation = "*";
                    operationClicked = true;
                }
                else
                {
                    binding.txtFirstValue.setText(binding.txtFirstValue.getText().toString().substring(0,binding.txtFirstValue.getText().toString().length()-1)+"*");
                    operation = "*";
                }
            }
        });

        binding.btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!operationClicked) {
                    String value = isWhole(Float.parseFloat(binding.txtResult.getText().toString()))? String.valueOf(Math.round(Float.parseFloat(binding.txtResult.getText().toString()))) : binding.txtResult.getText().toString();
                    binding.txtFirstValue.setText(value + "/");
                    binding.txtResult.setText("0");
                    operation = "/";
                    operationClicked = true;
                }
                else
                {
                    binding.txtFirstValue.setText(binding.txtFirstValue.getText().toString().substring(0,binding.txtFirstValue.getText().toString().length()-1)+"/");
                    operation = "/";
                }
            }
        });

        binding.btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                binding.txtFirstValue.setText("");
                binding.txtResult.setText("0");
            }
        });

        binding.btnBackSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                binding.txtResult.setText(binding.txtResult.getText().toString().substring(0, binding.txtResult.getText().toString().length() - 1));
            }
        });
    }

    private void Calculate()
    {
        Integer index = binding.txtFirstValue.getText().toString().indexOf(operation);
        String text = binding.txtFirstValue.getText().toString().substring(index+1,binding.txtFirstValue.getText().toString().length());
        boolean equalCheck = text.isEmpty()?true:false;
        if(equalCheck) {
            Float a;
            Float b;
            Float result;
            Integer intResult;
            switch (operation) {
                case "+":
                    a = Float.parseFloat(binding.txtFirstValue.getText().toString().substring(0, binding.txtFirstValue.getText().toString().length() - 1));
                    b = Float.parseFloat(binding.txtResult.getText().toString());
                    result = a + b;
                    if (isWhole(result)) {
                        intResult = Math.round(result);
                        binding.txtFirstValue.append(binding.txtResult.getText().toString());
                        binding.txtResult.setText(intResult.toString());
                    } else {
                        binding.txtFirstValue.append(binding.txtResult.getText().toString());
                        binding.txtResult.setText(result.toString());
                    }
                    break;

                case "-":
                    a = Float.parseFloat(binding.txtFirstValue.getText().toString().substring(0, binding.txtFirstValue.getText().toString().length() - 1));
                    b = Float.parseFloat(binding.txtResult.getText().toString());
                    result = a - b;
                    if (isWhole(result)) {
                        intResult = Math.round(result);
                        binding.txtFirstValue.append(binding.txtResult.getText().toString());
                        binding.txtResult.setText(intResult.toString());
                    } else {
                        binding.txtFirstValue.append(binding.txtResult.getText().toString());
                        binding.txtResult.setText(result.toString());
                    }
                    break;

                case "*":
                    a = Float.parseFloat(binding.txtFirstValue.getText().toString().substring(0, binding.txtFirstValue.getText().toString().length() - 1));
                    b = Float.parseFloat(binding.txtResult.getText().toString());
                    result = a * b;
                    if (isWhole(result)) {
                        intResult = Math.round(result);
                        binding.txtFirstValue.append(binding.txtResult.getText().toString());
                        binding.txtResult.setText(intResult.toString());
                    } else {
                        binding.txtFirstValue.append(binding.txtResult.getText().toString());
                        binding.txtResult.setText(result.toString());
                    }
                    break;

                case "/":
                    a = Float.parseFloat(binding.txtFirstValue.getText().toString().substring(0, binding.txtFirstValue.getText().toString().length() - 1));
                    b = Float.parseFloat(binding.txtResult.getText().toString());
                    result = a / b;
                    if (isWhole(result)) {
                        intResult = Math.round(result);
                        binding.txtFirstValue.append(binding.txtResult.getText().toString());
                        binding.txtResult.setText(intResult.toString());
                    } else {
                        binding.txtFirstValue.append(binding.txtResult.getText().toString());
                        binding.txtResult.setText(result.toString());
                    }
                    break;
            }
        }
    }

    public boolean isWhole(float value) {
        return Math.floor(value) == value;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}