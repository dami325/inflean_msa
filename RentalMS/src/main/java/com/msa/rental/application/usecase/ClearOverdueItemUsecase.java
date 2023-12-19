package com.msa.rental.application.usecase;

import com.msa.rental.framework.web.dto.ClearOverdueInfoDTO;
import com.msa.rental.framework.web.dto.RentalResultOutputDTO;

/**
 * 연체 해제 유스케이스
 */
public interface ClearOverdueItemUsecase {

    RentalResultOutputDTO clearOverdue(ClearOverdueInfoDTO clearOverdueInfoDTO)throws Exception;

}
