package org.o7planning.api.output;

import org.o7planning.dto.StudentDTO;

import java.util.ArrayList;
import java.util.List;

public class StudentOutput {
    private int page;
    private int totalPage;
    private List<StudentDTO> listResult = new ArrayList<>();

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<StudentDTO> getListResult() {
        return listResult;
    }

    public void setListResult(List<StudentDTO> listResult) {
        this.listResult = listResult;
    }
}
