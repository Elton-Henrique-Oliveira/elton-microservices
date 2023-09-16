package br.com.elton.Controller;

import br.com.elton.usecase.MathUseCase;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    MathUseCase mathUseCase = new MathUseCase();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(@PathVariable(name = "numberOne") String numberOne, @PathVariable(name = "numberTwo") String numberTwo) throws Exception {
        return mathUseCase.sum(numberOne, numberTwo);
    }

    @RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sub(@PathVariable(name = "numberOne") String numberOne, @PathVariable(name = "numberTwo") String numberTwo) throws Exception {
        return mathUseCase.sub(numberOne, numberTwo);
    }

    @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiplication(@PathVariable(name = "numberOne") String numberOne, @PathVariable(name = "numberTwo") String numberTwo) throws Exception {
        return mathUseCase.multiplication(numberOne, numberTwo);
    }

    @RequestMapping(value = "/divide/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double divide(@PathVariable(name = "numberOne") String numberOne, @PathVariable(name = "numberTwo") String numberTwo) throws Exception {
        return mathUseCase.divide(numberOne, numberTwo);
    }

    @RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double mean(@PathVariable(name = "numberOne") String numberOne, @PathVariable(name = "numberTwo") String numberTwo) throws Exception {
        return mathUseCase.mean(numberOne, numberTwo);
    }

    @RequestMapping(value = "/root/{number}", method = RequestMethod.GET)
    public Double root(@PathVariable(name = "number") String number) throws Exception {
        return mathUseCase.root(number);
    }
}