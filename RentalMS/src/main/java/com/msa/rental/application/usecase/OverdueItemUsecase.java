package com.msa.rental.application.usecase;

import com.msa.rental.framework.web.dto.RentalCardOutputDTO;
import com.msa.rental.framework.web.dto.UserItemInputDTO;

/**
 * 연체 처리 유스케이스
 */
public interface OverdueItemUsecase {

    public RentalCardOutputDTO overdueItem(UserItemInputDTO rental) throws Exception;

}
