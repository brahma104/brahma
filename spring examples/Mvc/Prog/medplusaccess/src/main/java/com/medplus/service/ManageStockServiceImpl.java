package com.medplus.service;

import java.util.ArrayList;
import java.util.List;

import com.medplus.bo.MedicineBo;
import com.medplus.dao.MedicineDao;
import com.medplus.dto.MedicinesDto;

public class ManageStockServiceImpl implements ManageStockService {
	private MedicineDao medicineDao;

	@Override
	public List<MedicinesDto> getMedicines() {
		MedicinesDto medicineDto = null;
		List<MedicineBo> medicineBos = null;
		List<MedicinesDto> medicinesDtos = null;

		medicineBos = medicineDao.getMedicines();
		medicinesDtos = new ArrayList<>();
		for (MedicineBo bo : medicineBos) {
			medicineDto = new MedicinesDto();
			medicineDto.setMedicineName(bo.getMedicineName());
			medicineDto.setManufacturer(bo.getManufacturer());
			medicineDto.setPrice(bo.getPrice());
			medicineDto.setQuantity(bo.getQuantity());
			medicinesDtos.add(medicineDto);
		}

		return medicinesDtos;
	}

	public void setMedicineDao(MedicineDao medicineDao) {
		this.medicineDao = medicineDao;
	}

}
