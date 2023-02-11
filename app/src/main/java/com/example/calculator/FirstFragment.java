package com.example.calculator;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.calculator.databinding.FragmentFirstBinding;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class FirstFragment extends Fragment {
    // TODO: 09-02-2023 Optimize and minimize the code
    // TODO: 09-02-2023 Add history to the calculator on history button click, for this make a local storage to store the history.
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
                binding.btnClear.setText("C");
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
                binding.btnClear.setText("C");
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
                binding.btnClear.setText("C");
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
                binding.btnClear.setText("C");
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
                binding.btnClear.setText("C");
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
                binding.btnClear.setText("C");
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
                binding.btnClear.setText("C");
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
                binding.btnClear.setText("C");
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
                binding.btnClear.setText("C");
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
                binding.btnClear.setText("C");
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
                binding.btnClear.setText("C");
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
                    String[] files = getActivity().fileList();
                    String filename = "calcHistory";

                    if(files.length==0)//Create the file
                    {
                        File file = new File(getActivity().getFilesDir(), filename);
                    }

                    try (FileOutputStream fos = getActivity().openFileOutput(filename, Context.MODE_PRIVATE)) {//Write To the file
                        fos.write(binding.txtFirstValue.getText().toString().getBytes());
                    }
                    catch (Exception ex)
                    {

                    }
                }
                operationClicked =false;
            }
        });

        binding.btnHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String filename = "calcHistory";
                FileInputStream fis = null;
                try {
                    fis = getActivity().openFileInput(filename);
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
                InputStreamReader inputStreamReader = new InputStreamReader(fis, StandardCharsets.UTF_8);
                StringBuilder stringBuilder = new StringBuilder();
                try (BufferedReader reader = new BufferedReader(inputStreamReader)) {
                    String line = reader.readLine();
                    while (line != null) {
                        stringBuilder.append(line).append('\n');
                        line = reader.readLine();
                    }
                } catch (IOException e) {
                    // Error occurred when opening raw file for reading.
                } finally {
                    String contents = stringBuilder.toString();
                }
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
                operationClicked = false;
                if(!binding.txtFirstValue.getText().toString().isEmpty() && binding.btnClear.getText().toString().equals("C"))
                {
                    binding.txtResult.setText("0");
                    binding.btnClear.setText("AC");
                }
                else
                {
                    binding.txtFirstValue.setText("");
                    binding.txtResult.setText("0");
                    binding.btnClear.setText("C");
                }
            }
        });

        binding.btnBackSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(binding.txtResult.getText().toString().length() > 1)
                    binding.txtResult.setText(binding.txtResult.getText().toString().substring(0, binding.txtResult.getText().toString().length() - 1));
                else
                {
                    binding.txtResult.setText("0");
                }

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