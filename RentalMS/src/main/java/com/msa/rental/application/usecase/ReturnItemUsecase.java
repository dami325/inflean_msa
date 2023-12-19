package com.msa.rental.application.usecase;

import com.msa.rental.framework.web.dto.RentalCardOutputDTO;
import com.msa.rental.framework.web.dto.UserItemInputDTO;

/**
 * 반납 유스케이스
 */
public interface ReturnItemUsecase {

    public RentalCardOutputDTO returnItem(UserItemInputDTO returnDto) throws Exception;

}
