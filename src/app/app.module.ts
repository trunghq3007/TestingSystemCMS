import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MatButtonModule, MatCheckboxModule} from '@angular/material';
import { HeaderModule } from './header/header.module';
import { NavModule } from './nav/nav.module';
import { FooterModule } from './footer/footer.module';
import { CategoryQuestionModule } from './category-question/category-question.module';
import { QuestionModule } from './question/question.module';
import { ReactiveFormsModule } from '@angular/forms';
@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    MatButtonModule, MatCheckboxModule,
    NavModule,
    HeaderModule,
    FooterModule,
    QuestionModule,
    CategoryQuestionModule,
    AppRoutingModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
