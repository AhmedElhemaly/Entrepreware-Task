import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NumVerifyComponent } from './num-verify.component';

describe('NumVerifyComponent', () => {
  let component: NumVerifyComponent;
  let fixture: ComponentFixture<NumVerifyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NumVerifyComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NumVerifyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
