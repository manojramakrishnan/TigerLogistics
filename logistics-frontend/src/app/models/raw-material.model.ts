import { Warehouse } from './warehouse.model';

export class RawMaterial {

  materialName: string;
  rawMaterialId: number;
  description: string;
  quantityAvailable: number;
  quantityUnit: string;
  warehouse: Warehouse;
}
