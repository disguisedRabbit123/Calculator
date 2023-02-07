package com.example.calculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.calculator.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    private String operation="";

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
                if(Integer.parseInt(binding.txtResult.getText().toString()) == 0)
                {
                    binding.txtResult.setText("");
                }
               binding.txtResult.append("1");
            }
        });

        binding.btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Integer.parseInt(binding.txtResult.getText().toString()) == 0)
                {
                    binding.txtResult.setText("");
                }
                binding.txtResult.append("2");
            }
        });

        binding.btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Integer.parseInt(binding.txtResult.getText().toString()) == 0)
                {
                    binding.txtResult.setText("");
                }
                binding.txtResult.append("3");
            }
        });

        binding.btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Integer.parseInt(binding.txtResult.getText().toString()) == 0)
                {
                    binding.txtResult.setText("");
                }
                binding.txtResult.append("4");
            }
        });

        binding.btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Integer.parseInt(binding.txtResult.getText().toString()) == 0)
                {
                    binding.txtResult.setText("");
                }
                binding.txtResult.append("5");
            }
        });

        binding.btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Integer.parseInt(binding.txtResult.getText().toString()) == 0)
                {
                    binding.txtResult.setText("");
                }
                binding.txtResult.append("6");
            }
        });

        binding.btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Integer.parseInt(binding.txtResult.getText().toString()) == 0)
                {
                    binding.txtResult.setText("");
                }
                binding.txtResult.append("7");
            }
        });

        binding.btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Integer.parseInt(binding.txtResult.getText().toString()) == 0)
                {
                    binding.txtResult.setText("");
                }
                binding.txtResult.append("8");
            }
        });

        binding.btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Integer.parseInt(binding.txtResult.getText().toString()) == 0)
                {
                    binding.txtResult.setText("");
                }
                binding.txtResult.append("9");
            }
        });

        binding.btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Integer.parseInt(binding.txtResult.getText().toString()) == 0)
                {
                    binding.txtResult.setText("");
                }
                binding.txtResult.append("0");
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
                if(binding.txtResult.getText().toString() != "" && binding.txtFirstValue.getText().toString()!="")
                    Calculate();
            }
        });

        binding.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.txtFirstValue.setText(binding.txtResult.getText().toString() + "+");
                binding.txtResult.setText("0");
                operation = "+";
            }
        });

        binding.btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.txtFirstValue.setText(binding.txtResult.getText().toString() + "-");
                binding.txtResult.setText("0");
                operation = "-";
            }
        });

        binding.btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.txtFirstValue.setText(binding.txtResult.getText().toString() + "*");
                binding.txtResult.setText("0");
                operation = "*";
            }
        });

        binding.btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.txtFirstValue.setText(binding.txtResult.getText().toString() + "/");
                binding.txtResult.setText("0");
                operation = "/";
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
        Float a;
        Float b;
        Float result;
        Integer intResult;
        switch(operation) {
            case "+" :
                 a = Float.parseFloat(binding.txtFirstValue.getText().toString().substring(0, binding.txtFirstValue.getText().toString().length() - 1));
                 b = Float.parseFloat(binding.txtResult.getText().toString());
                 result = a+b;
                if(isWhole(result))
                {
                    intResult = Math.round(result);
                    binding.txtFirstValue.append(binding.txtResult.getText().toString());
                    binding.txtResult.setText(intResult.toString());
                }
                else
                {
                    binding.txtFirstValue.append(binding.txtResult.getText().toString());
                    binding.txtResult.setText(result.toString());
                }
                break;

            case "-" :
                 a = Float.parseFloat(binding.txtFirstValue.getText().toString().substring(0, binding.txtFirstValue.getText().toString().length() - 1));
                 b = Float.parseFloat(binding.txtResult.getText().toString());
                result = a-b;
                if(isWhole(result))
                {
                    intResult = Math.round(result);
                    binding.txtFirstValue.append(binding.txtResult.getText().toString());
                    binding.txtResult.setText(intResult.toString());
                }
                else
                {
                    binding.txtFirstValue.append(binding.txtResult.getText().toString());
                    binding.txtResult.setText(result.toString());
                }
                break;

            case "*" :
                 a = Float.parseFloat(binding.txtFirstValue.getText().toString().substring(0, binding.txtFirstValue.getText().toString().length() - 1));
                 b = Float.parseFloat(binding.txtResult.getText().toString());
                result = a*b;
                if(isWhole(result))
                {
                    intResult = Math.round(result);
                    binding.txtFirstValue.append(binding.txtResult.getText().toString());
                    binding.txtResult.setText(intResult.toString());
                }
                else
                {
                    binding.txtFirstValue.append(binding.txtResult.getText().toString());
                    binding.txtResult.setText(result.toString());
                }
                break;

            case "/" :
                 a = Float.parseFloat(binding.txtFirstValue.getText().toString().substring(0, binding.txtFirstValue.getText().toString().length() - 1));
                 b = Float.parseFloat(binding.txtResult.getText().toString());
                result = a/b;
                if(isWhole(result))
                {
                    intResult = Math.round(result);
                    binding.txtFirstValue.append(binding.txtResult.getText().toString());
                    binding.txtResult.setText(intResult.toString());
                }
                else
                {
                    binding.txtFirstValue.append(binding.txtResult.getText().toString());
                    binding.txtResult.setText(result.toString());
                }
                break;
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