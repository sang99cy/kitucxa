package org.o7planning.api;

import java.util.ArrayList;

import org.o7planning.api.output.StudentOutput;
import org.o7planning.dto.StudentDTO;
import org.o7planning.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class StudentAPI {

    @Autowired
    private IStudentService studentService;


    @GetMapping(value = "/student")
    public StudentOutput showStudent(@RequestParam(value = "page", required = false) Integer page,
                                     @RequestParam(value = "limit", required = false) Integer limit) {
        StudentOutput studentOutput = new StudentOutput();
        if (page == null && limit == null){
            page = 1;
            limit = 10;
        }
        studentOutput.setPage(page);
        Pageable pageable = new PageRequest(page - 1, limit);
        studentOutput.setListResult(studentService.findAll(pageable));
        studentOutput.setTotalPage((int) Math.ceil((double) studentService.totalItem() / limit));
        return studentOutput;

    }

    @GetMapping(value = "/studentPage")
    public ArrayList<StudentDTO> getStudent() {
        return studentService.getAll();
    }

    @GetMapping(value = "/student/{id}")
    public StudentDTO getStudentById(@PathVariable("id") Long id) {
        return studentService.getStudentById(id);
    }

    @GetMapping(value = "/students")
    public ArrayList<StudentDTO> getStudentByCode(@RequestBody String code) {
        return studentService.getStudentByCode(code);
    }

    @PostMapping(value = "/student")
    public StudentDTO createStudent(@RequestBody StudentDTO model) {
        return studentService.save(model);
    }


    @PutMapping(value = "/student/{id}")
    public StudentDTO updateStudent(@RequestBody StudentDTO model) {
        // set id
        return studentService.save(model);
    }

    @DeleteMapping(value = "/student")
    public void deleteListStudent(@RequestBody long[] ids) {
        studentService.delete(ids);
    }


    @DeleteMapping(value = "/student/{id}")
    public void deleteStudent(@PathVariable("id") Long id) {
        studentService.deleteById(id);

    }
}
