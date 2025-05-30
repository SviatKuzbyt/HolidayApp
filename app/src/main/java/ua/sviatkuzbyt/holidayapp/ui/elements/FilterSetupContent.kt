package ua.sviatkuzbyt.holidayapp.ui.elements

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import ua.sviatkuzbyt.holidayapp.R
import ua.sviatkuzbyt.holidayapp.ui.theme.AppTheme

@Composable
fun ColumnScope.FilterSetupContent(
    countryText: String,
    onCountryChange: (String) -> Unit,
    yearText: String,
    onYearChange: (String) -> Unit,
    onUpdateClick: () -> Unit
){
    FilterField(
        text = countryText,
        onTextChange = onCountryChange,
        hint = R.string.country_hint,
        icon = R.drawable.ic_country
    )

    FilterField(
        text = yearText,
        onTextChange = onYearChange,
        hint = R.string.year_hint,
        icon = R.drawable.ic_year
    )

    MainButton(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 20.dp)
            .padding(horizontal = 16.dp),
        text = stringResource(R.string.update),
        onClick = onUpdateClick
    )
}

@Composable
private fun FilterField(
    text: String,
    onTextChange: (String) -> Unit,
    @StringRes hint: Int,
    @DrawableRes icon: Int
){

    OutlinedTextField(
        value = text,
        onValueChange = onTextChange,
        singleLine = true,
        textStyle = AppTheme.types.basic,
        shape = AppTheme.shapes.container,

        placeholder = {
            Text(
                text = stringResource(hint),
                style = AppTheme.types.gray
            )
        },

        leadingIcon = {
            Icon(
                imageVector = ImageVector.vectorResource(icon),
                contentDescription = stringResource(hint),
                tint = AppTheme.colors.textPrimary
            )
        },

        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = AppTheme.colors.background,
            unfocusedContainerColor = AppTheme.colors.background,
            unfocusedBorderColor = AppTheme.colors.background,
            focusedBorderColor = AppTheme.colors.background,
            focusedTextColor = AppTheme.colors.textPrimary,
            unfocusedTextColor = AppTheme.colors.textPrimary,
            cursorColor = AppTheme.colors.primary,
        ),

        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .padding(bottom = 16.dp)
    )
}