package br.com.elton.usecase;

import br.com.elton.exception.UnsupportedMathOperationException;
import br.com.elton.functions.NumberConverter;
import br.com.elton.repository.MathRepository;

public class MathUseCase {
    public MathUseCase() {
    }

    MathRepository mathRepository = new MathRepository();

    public Double sum(String numberOne, String numberTwo) {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }

        return mathRepository.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    public Double sub(String numberOne, String numberTwo) {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }

        return mathRepository.sub(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    public Double multiplication(String numberOne, String numberTwo) {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }

        return mathRepository.multiplication(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    public Double divide(String numberOne, String numberTwo) {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        if (NumberConverter.convertToDouble(numberTwo) == 0) {
            throw new UnsupportedMathOperationException("Dividend cannot be zero, change the second number to a number greater than zero.");
        }

        return mathRepository.divide(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    public Double mean(String numberOne, String numberTwo) {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }

        return mathRepository.mean(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
    }

    public Double root(String number) {
        if (!NumberConverter.isNumeric(number)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }

        return mathRepository.root(NumberConverter.convertToDouble(number));
    }
}
